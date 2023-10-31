import React from "react";

const BookDropDown = () => {
  return (
    <div className="btn-group">
      <button
        type="button"
        className="btn btn-success dropdown-toggle"
        data-toggle="dropdown"
        aria-haspopup="true"
        aria-expanded="false"
      >
        Add Book
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

export default BookDropDown;
