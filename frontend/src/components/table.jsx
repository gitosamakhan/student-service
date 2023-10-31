import BookDropDown from "./bookDropDown";
import CourseDropDown from "./courseDropDown";
import DeleteStudentButton from "./deleteStudentButton";

const Table = ({ data }) => {
  return (
    <div>
      <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Courses</th>
            <th scope="col">Books</th>
            <th scope="col">Manage Course</th>
            <th scope="col">Manage Book</th>
            <th scope="col">Delete Student</th>
          </tr>
        </thead>
        <tbody>
          {data.map((student) => (
            <tr key={student.id}>
              <td>{student.id}</td>
              <td>{student.name}</td>
              <td>{student.courses.length}</td>
              <td>{student.books.length}</td>
              <td>
                <CourseDropDown />
              </td>
              <td>
                <BookDropDown />
              </td>
              <td>
                <DeleteStudentButton />
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Table;
