package com.makingdevs.essentials;
 
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
 
@RunWith(MockitoJUnitRunner.class)
public class TaskManagerUnitTests {
 
  @Mock
  private TaskStore taskStore;
  @Mock
  private Task task;
 
  @InjectMocks
  TaskManager taskManager = new TaskManager();
 
  @Test
  public void aTaskManagerWithZeroTasks(){
    when(taskStore.count()).thenReturn(0);
    assertTrue(taskManager.howManyTasks() == 0);
    verify(taskStore).count();
  }
 
  @Test
  public void aTaskManagerWithOneTasks(){
    when(taskStore.count()).thenReturn(1);
    taskManager.addTask(task);
    assertTrue(taskManager.howManyTasks() == 1);
    verify(taskStore).createTask(task);
    verify(taskStore).count();
  }
 
  @Test
  public void addATaskFromAString(){
    when(taskStore.count()).thenReturn(1);
    taskManager.addTask("new task with String");
    assertTrue(taskManager.howManyTasks() == 1);
    verify(taskStore).createTask(any(Task.class));
    verify(taskStore).count();
  }
 
  @Test
  public void addATasksFromAList(){
    assertNotNull(taskManager);
    List<Task> tasksToAdd = new ArrayList<Task>();
    tasksToAdd.add(new Task());
    tasksToAdd.add(new Task());
    when(taskStore.count()).thenReturn(2);
    taskManager.addTask(tasksToAdd);
    assertTrue(taskManager.howManyTasks() == 2);
    verify(taskStore,times(2)).createTask(any(Task.class));
    verify(taskStore).count();
  }
 
  @Test
  public void addATasksFromAFile(){
    assertTrue(false);
  }
 
  @Test
  public void getATaskByIndex(){
    when(taskStore.readTask(1L)).thenReturn(new Task());
    Task task = taskManager.getTaskAt(1);
    assertNotNull(task);
    verify(taskStore).readTask(1L);
  }
 
  @Test
  public void findTaskByDescription(){
    when(taskStore.findTask("new task")).thenReturn(new Task());
    Task task = taskManager.findTask("new task");
    assertNotNull(task);
    verify(taskStore).findTask("new task");
  }
 
  @Test
  public void findAllTasksByDescription(){
    List<Task> tasks = new ArrayList<Task>();
    tasks.add(new Task());
    tasks.add(new Task());
    when(taskStore.findAllTasks("new task")).thenReturn(tasks);
    List<Task> tasksFound = taskManager.findTasks("new task");
    assertTrue(tasksFound.size() == 2);
    verify(taskStore).findAllTasks("new task");
  }
 
}