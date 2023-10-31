import React, { useState, useEffect } from "react";
import { getAllStudents } from "../client";
import Table from "./table";

const Students = () => {
  const [students, setStudents] = useState([]);

  const fetchStudents = () => {
    getAllStudents()
      .then((response) => response.json())
      .then((data) => {
        setStudents(data);
      })
      .catch((error) => {
        error.response.json().then((resp) => {
          console.log(resp);
        });
      });
  };
  useEffect(() => {
    fetchStudents();
  }, []);
  return <Table data={students} />;
};

export default Students;
