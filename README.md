# Lab03 Exercises

# Lab 3 Answers

## Part 1: Git

### 1.1. List the contents of the lab03-exercises repo immediately after initialization

```
commit be9ca01fa888e5253fae2d66b7b28535767b70ab (HEAD -> main)
Author: Hayden514 <zchen@unca.edu>
Date:   Thu Sep 4 10:59:44 2025 -0400

    add README.md to the repository



```

### 1.2. Paste the output of your `git status` command

```
On branch main
nothing to commit, working tree clean


```

### 1.3. Paste the output of the state of your repository after committing your README.md file

```
[main e9252d9] add README.md to the repository
 1 file changed, 90 insertions(+)


```

### 1.4. Copy your `git log` output

```
commit e9252d98b042ba46eda63ab56190ccdf006b328f (HEAD -> main)
Author: Hayden514 <zchen@unca.edu>
Date:   Thu Sep 4 11:11:27 2025 -0400

    add README.md to the repository

commit be9ca01fa888e5253fae2d66b7b28535767b70ab
Author: Hayden514 <zchen@unca.edu>
Date:   Thu Sep 4 10:59:44 2025 -0400

    add README.md to the repository


```

### 1.5. Copy your `git diff` output

```
diff --git a/README.md b/README.md
index da07420..ad50a19 100644
--- a/README.md
+++ b/README.md
@@ -29,7 +29,8 @@ nothing to commit, working tree clean
 ### 1.3. Paste the output of the state of your repository after committing your README.md file

```

-# paste code here +[main e9252d9] add README.md to the repository

- 1 file changed, 90 insertions(+)

````

### 1.6. Reflection

We've learned 6 git subcommands now. Describe each of them in your own words in the section below:

- git init       This is how you add Git to your project.
- git status     It lets you see the current state of your files.
- git add         This  is how you start tracking individual files.
- git commit      It creates a new commit.
- git log          It displays the commit history of your repository.
- git diff          It shows the differences between various states of your repository.

### 1.7. Practice: Find All Duplicates (Java)

Make sure you implement the `FindDuplicates.java` class as specified in the instructions (with the nested loops implementation).

## Part 2: GitHub

### 2.1. Practice: Find All Duplicates (Python)

Make sure you implement the `find_duplicates.py` file as specified in the instructions (with the nested loops implementation).

## Part 3: Branching

### 3.1. Implement the More Efficient Version of the "Find Duplicates" problem

Implement the more efficient Version of the "Find Duplicates" problem using a dictionary (or hashmap) data structure instead of nested loops. You may do this in either your Python file or in the Java file that you’ve already made. Do this by adding a second function/method to your Java/Python file with a slightly different name.

### 3.2. Link to Repo

Please make sure that the new repo that you made today on GitHub is public, and paste a link to it below.

```bash
https://github.com/Hayden514/lab03-exercise

````

### 3.3. What do the three "Merge pull request" options mean?

Describe each of them in your own words.### 3.3. What do the three "Merge pull request" options mean?

1. **Create a merge commit**:  
   This option merges the feature branch into the main branch while keeping all the commits from the feature branch.  
   Git creates an extra "merge commit" to show that a merge occurred.

   - Advantage: preserves full history of the branch.
   - Disadvantage: can make the commit history more complex.

2. **Squash and merge**:  
   This option combines all commits from the feature branch into a single commit and merges it into the main branch.

   - Advantage: keeps the main branch history clean and simple.
   - Disadvantage: loses the individual commits from the feature branch.

3. **Rebase and merge**:  
   This option takes the commits from the feature branch and applies them on top of the main branch, creating a linear history without an extra merge commit.
   - Advantage: produces a linear and clean commit history.
   - Disadvantage: rewrites commit history, which may be risky if others already depend on the branch.
