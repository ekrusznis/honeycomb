import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter, Route, Navigate, Router } from "react-router-dom";

import "./assets/css/nucleo-icons.css";
import "./assets/scss/blk-design-system-react.scss?v=1.2.0";
import "./assets/demo/demo.css";

import Index from "./views/Index.js";
import LandingPage from "./views/examples/LandingPage.js";
import RegisterPage from "./views/examples/RegisterPage.js";
import ProfilePage from "./views/examples/ProfilePage.js";
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

ReactDOM.render(
  <BrowserRouter>
    <Router>
      <Route path="/components" render={(props) => <Index {...props} />} />
      <Route
        path="/landing-page"
        render={(props) => <LandingPage {...props} />}
      />
      <Route
        path="/register-page"
        render={(props) => <RegisterPage {...props} />}
      />
      <Route
        path="/profile-page"
        render={(props) => <ProfilePage {...props} />}
      />
      <Navigate from="/" to="/components" />
    </Router>
  </BrowserRouter>,
  document.getElementById("root")
);