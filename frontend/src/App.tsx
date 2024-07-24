import Login from "base-auth-client/login"
import "./App.css"
import logo from "./logo.svg"
import { get } from "base-auth-client"

const App = () => {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Login />
        <h1
          onClick={() => {
            get("/public/user")
          }}
        >
          Test
        </h1>
      </header>
    </div>
  )
}

export default App
