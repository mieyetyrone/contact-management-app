import './App.css';
import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Link } from 'react-router-dom'

function App() {
  return (
    <div className="container pt-3">
      <h1>Contacts Management</h1>
      <Link className="btn btn-outline-secondary btn-lg" to= "/create" style={{margin: "10px"}}>Add contact</Link>
      <Link className="btn btn-outline-secondary btn-lg" to= "/contacts" style={{margin: "10px"}}>View contacts</Link>
    </div>
    
  );
}

export default App;
