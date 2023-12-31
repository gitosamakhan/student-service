import fetch from "unfetch";

const checkStatus = (response) => {
  if (response.ok) {
    return response;
  }
  const error = new Error(response.statusText);
  error.response = response;
  return Promise.reject(error);
};

export const getAllStudents = () => fetch("api/v1/student").then(checkStatus);

export const addNewStudent = (student) =>
  fetch("api/v1/student", {
    headers: {
      "Content-Type": "application/json",
    },
    method: "POST",
    body: JSON.stringify(student),
  }).then(checkStatus);

export const deleteStudent = (studentId) =>
  fetch(`api/v1/student/${studentId}`, {
    method: "DELETE",
  }).then(checkStatus);
