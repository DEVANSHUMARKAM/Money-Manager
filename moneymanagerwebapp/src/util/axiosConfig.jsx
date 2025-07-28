import axios from "axios";

const axiosConfig = axios.create({
    baseURL: "https://localhost:8080",
    headers: {
        "Content-Type": "application/json",
        Accept: "application/json"
    }
});

