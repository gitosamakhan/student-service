import React from "react";

const CourseDropDown = () => {
  return (
    <div className="btn-group m-1">
      <button
        type="button"
        className="btn btn-primary dropdown-toggle"
        data-toggle="dropdown"
        aria-haspopup="true"
        aria-expanded="false"
      >
        Add Course
      </button>
      <div className="dropdown-menu">
        <a className="dropdown-item" href="/#">
          Action
        </a>
        <a className="dropdown-item" href="/#">
          Another action
        </a>
        <a className="dropdown-item" href="/#">
          Something else here
        </a>
        <a className="dropdown-item" href="/#">
          Separated link
        </a>
      </div>
    </div>
  );
};

export default CourseDropDown;
