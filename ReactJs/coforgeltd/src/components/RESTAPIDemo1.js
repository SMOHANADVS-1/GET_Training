import React from 'react'
import {useEffect,useState} from 'react'
import{getUsersWithAxios, getUsersWithFetch} from '../service/UserService'
import '../styles/RESTAPIDemo.css' 


export default function RESTAPIDemo1() {
 const [fetchUsers, setFetchUsers] = useState([]);
    const [axiosUsers, setAxiosUsers] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const fetchData= async() =>{

            const users = await getUsersWithFetch();
            setFetchUsers(users);
            setLoading(false);
        };
             fetchData();
            
        
    }, []);

    useEffect(() => {
    
     const fetchData = async () => {
      const users = await getUsersWithAxios();
      setAxiosUsers(users);
    };
    fetchData();
    }, []);


  return (
     <div className="api-container">
      <h2>React Hooks API Demo (Service Implementation)</h2>

      {loading ? (
        <p className="loading">Loading data...</p>
      ) : (
        <>
          <div className="api-section">
            <h3>Fetch API Data</h3>
            <ul>
              {fetchUsers.map(user => (
                <li key={user.id}>
                  <strong>{user.name}</strong> — {user.email}-
                </li>
              ))}
            </ul>
          </div>

          <div className="api-section">
            <h3>Axios API Data</h3>
            <ul>
              {axiosUsers.map(user => (
                <li key={user.id}>
                  <strong>{user.name}</strong> — {user.email} - {user.address.city}
                </li>
              ))}
            </ul>
          </div>
        </>
      )}
    </div>

  )
}
