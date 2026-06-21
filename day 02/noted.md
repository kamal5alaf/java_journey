What is Git?

Git is a version control system that tracks changes in files so developers can collaborate and restore previous versions when needed.

Git Commands Used Today
git init — initializes a new Git repository
git add — stages changes before committing
git commit — saves a snapshot of changes
git status — shows the current status of the repository
git push — uploads changes to GitHub
Confusion & Resolution

I was confused about the difference between staging and committing.
I learned that:

git add stages changes and prepares them to be saved.
git commit permanently saves those changes in Git history.
What Are Branches?

Branches are separate versions of the code used to develop new features or fix bugs without affecting the main branch (main).

Commands I Used
git checkout main → switch to the main branch
git checkout -b feature/my-first-branch → create a new branch and switch to it
git add notes.md → add the file to the staging area
git commit -m "message" → save the changes
git push origin feature/my-first-branch → upload the branch to GitHub
What Happened Next?

After pushing the branch, I opened a Pull Request to merge the changes into main, then merged the branch successfully.
