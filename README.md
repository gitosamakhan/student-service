# Student Service 👨‍🎓

This is a test project made to understand the implementation of:

<details>
<summary>Spring Data JPA</summary>

Some important points regarding spring data jpa:

* CascadeType is related to the persistence(saving), deletion i.e of database entities. It has nothing to do with the code.
* FetchType means loading data.
  * LAZY: Don't load associated entity.
    * default in `OneToOne`
  * EAGER: Load associated entity.
    * default in `OneToMany` & `ManyToMany`
* Setting the `mappedBy` property will make the relationship bidirectional.
* Unidirectional relationship causes join tables in the database except for `ManyToMany`.
* Add `@JsonIgnore` on one of the linked entities to avoid recursion.
* Add `@JoinColumn` on one of the linked entities to make it a foreign key.

</details>

<details>
<summary>Exceptional Handling / Error Handling</summary>

</details>
