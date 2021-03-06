# Build_And_Release_Management
Welcome to Build_And_Release_Management 📋 This Repository was made to maintain various [LAB CONTENT](https://github.com/theabhishek07/Build_And_Release_Management/tree/master/LAB_WORK), [ASSIGNMENTS](https://github.com/theabhishek07/Build_And_Release_Management/tree/master/ASSIGNMENTS), [STUDY MATERIAL](https://github.com/theabhishek07/Build_And_Release_Management/tree/master/STUDY_MATERIAL) and all the Build And Release Management related stuff so that they all can be compiled in a single space. This Repository is maintained by theabhishek07 .This is a public Repository and all sorts of contributions to the code are welcomed.

**_You are always welcome to add more or improve any resource in this repository._**

# Steps to follow 📜

## 1. Fork it 🍴
You can get your own fork/copy of [Build_And_Release_Management](https://github.com/theabhishek07/Build_And_Release_Management) by using the `Fork` button.

![Fork Button](https://github-images.s3.amazonaws.com/help/bootcamp/Bootcamp-Fork.png)

## 2. Clone it 👥
You need to go to your Fork of the Repository and then clone (download) it to local machine using

`$ git clone https://github.com/Your_Username/Build_And_Release_Management.git`

This makes a local copy of repository in your machine.

Once you have cloned the `Build_And_Release_Management` repository in Github, move to that folder first using change directory command on linux and Mac.
```python
# This will change directory to a folder Build_And_Release_Management                                                                   
$ cd Build_And_Release_Management
```
Move to this folder for all other commands.

Now, lets add a reference to the original `Build_And_Release_Management` repository using

`$ git remote add upstream https://github.com/theabhishek07/Build_And_Release_Management.git` 

 This adds a new remote named **_upstream_**.

See the changes using
```pyhton
 $ git remote -v
 origin https://github.com/Your_Username/Build_And_Release_Management.git (fetch)                                                      
 origin https://github.com/Your_Username/Build_And_Release_Management.git (push)                                                        
 upstream https://github.com/theabhishek07/Build_And_Release_Management.git (fetch)                                                     
 upstream https://github.com/theabhishek07/Build_And_Release_Management.git (push)
 ```

## 3. Sync with the Remote 🔄
Always keep your local copy of repository updated with the original repository.
```python
# Fetch all remote repositories and delete any deleted remote branches
$ git fetch --all --prune
# Switch to master branch
$ git checkout master
# Reset local master branch to match upstream repository's master branch
$ git reset --hard upstream/master
# Push changes to your forked Build_And_Release_Management repo
$ git push origin master
```

## 4. Create a new branch ‼️
Whenever you are going to make a contribution. Please create a new branch using the command below and keep your `master` branch clean (i.e. synced with remote branch).
```python
# It will create a new branch <branchname> with name and switch to branch <branchname>
$ git checkout -b <branchname>
```
 
 To switch to desired branch
```python
# To switch from one folder to other
$ git checkout <branchname>
```

To add the changes to the branch. Use
```python
# To add all files to branch
$ git add .
```
Type in a message relevant for the code reveiwer using 
```python
# This message get associated with all files you have changed
$ git commit -m "relevant message"
```

Now, Push your awesome work to your remote repository using
```python
# To push your work to your remote repository
$ git push -u origin <branchname>
```

Finally, go to your repository in browser and click on `compare and pull requests`. Then add a title and description to your pull request that explains your precious effort.
