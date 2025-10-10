import logo from './logo.svg';
import './App.css';




//npm install react-router-dom
import { BrowserRouter as Router,Routes,Route } from 'react-router-dom';
import Main from './components/Main';
import Navbar from './components/Navbar';
import Footer from './components/Footer';
import JSXDemo from './components/JSXDemo';
import Profile from './components/Profile';
import PropsDemo from './components/PropsDemo';
import StateDemo from './components/StateDemo';
import Addition from './components/Addition';
import Login from './components/Login';
import HooksDemo from './components/HooksDemo';
import ListDemo from './components/ListDemo';
import SurveyForm from './components/SurveyForm';
import RESTAPIDemo1 from './components/RESTAPIDemo1';
import CustomerForm from './components/CustomerForm';
import DisplayCustomers from './components/DisplayCustomers';
//import RESTAPIDemo from './components/RESTAPIDemo';


function App() {
  return (
   

    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <h1>Welcome to Coforge  😍😍😍</h1>
      </header>
   

<section>
    <div className='Main'>
      <Router>
        <Navbar></Navbar>
        <Routes>
          <Route path='/' element={<Main/>}></Route>
           <Route path='jsx1' element={<JSXDemo/>}></Route>
          <Route path='/profile' element={<Profile/>}></Route>
          <Route path='/props' element={<PropsDemo/>}></Route>
          <Route path='/abc' element={<StateDemo/>}></Route>
          <Route path='/addNum' element={<Addition/>}></Route>
          <Route path='/login' element={<Login/>}></Route>
          <Route path='/hooks' element={<HooksDemo/>}></Route>
          <Route path='/listdemo' element={<ListDemo/>}></Route>
          <Route path='/survey' element={<SurveyForm/>}></Route>
          <Route path='/rest1' element={<RESTAPIDemo1/>}></Route>

          <Route path='/customers' element={<CustomerForm/>}></Route>
          <Route path='/display' element={<DisplayCustomers/>}></Route>
          
          
          

        </Routes>
      </Router>
     </div>
    
    </section>

    <div id="footer">
      <Footer></Footer>{/*Render Footer.js /component */}
     
    </div>

   </div>

   
  );
}

export default App;
