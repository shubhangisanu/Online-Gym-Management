import React from "react";

import { Navigate, useNavigate } from "react-router-dom";
import { Nav, Card, Button, Container } from "react-bootstrap";
export default function CustomerHome() {
    let user = JSON.parse(sessionStorage.getItem('UserInfo'));
    let navigate = useNavigate();
    const Logout = () => {
        sessionStorage.clear();
        alert("Do you Want to Logout!");
        navigate("/Login")
    }

    const bagdemo1 = {
        backgroundImage: "url('https://img.freepik.com/free-photo/set-healthy-lifestyle-objects_23-2148241582.jpg?t=st=1649394771~exp=1649395371~hmac=d576c4fa3152e76371d3c882e2331f6d373f867ffbfb9f7d98f27a3bc8f629e7&w=1060')",
        height: '100vh',
        backgroundSize: 'cover',
        backgroundRepeat: 'no-repeat',
    };

    return (
        <>
            <Container>
                <div className="container" style={bagdemo1}>
                    <Card>
                        <Card.Header>
                            <Nav variant="tabs" defaultActiveKey="#first">
                                <Nav.Item>
                                    <Nav.Link href="#">View Profile</Nav.Link>
                                </Nav.Item>
                                <Nav.Item>
                                    <Nav.Link onClick={Logout}>Logout</Nav.Link>
                                </Nav.Item>
                                <h1 style={{ textAlign: 'right', marginLeft: '300px', color: '#151B8D' }}>Welcome  {user.fname} {user.lname} </h1>
                            </Nav>
                        </Card.Header>
                        <Card.Body>
                            <Card.Title>Exercise and rest are the cornerstones of improving your quality of life.</Card.Title>
                            <Card.Text>
                                “Healthy happens when you go from Self-conscious to Self-crush.”
                                How often do you tell yourself I love you? Do you smile when you look…
                            </Card.Text>
                            <Button variant="primary" style={{ width: '300px' }} >Get Details</Button>
                        </Card.Body>
                    </Card>

                    <Card style={{ width: '18rem' }}>
                        <Card.Img variant="top" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png" height={'250px'} />
                        <Card.Body>
                            <Card.Title>Profile</Card.Title>
                            <Card.Text>
                                <pre><b>Name:</b>{user.fname} {user.lname}</pre>
                                <pre><b>Email:</b>{user.email}</pre>
                                <pre><b>Contact No.:</b>{user.contactno}</pre>
                                <pre><b>Address:</b>{user.address}</pre>
                                {/* <pre><b>Gender:</b>{user.gender}</pre> */}
                                <pre><b>DOB:</b>{user.birthdate}</pre>
                            </Card.Text>
                            {/* <Button variant="primary">Go somewhere</Button> */}
                        </Card.Body>
                    </Card>
                </div>
            </Container>
        </>
    );
}