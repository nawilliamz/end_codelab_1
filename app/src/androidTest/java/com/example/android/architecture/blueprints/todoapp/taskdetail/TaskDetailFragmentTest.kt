package com.example.android.architecture.blueprints.todoapp.taskdetail


import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import com.example.android.architecture.blueprints.todoapp.R
import com.example.android.architecture.blueprints.todoapp.data.Task
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@MediumTest
class TaskDetailFragmentTest{

    @Test
    fun activeTaskDetails_DisplayedInUi() {

        //GIVEN - Add active (incomplete) task to DB
        //This is the task that we want to see displayed to the fragment
        val activeTask = Task("Active Task", "AndroidX Rocks", false)


        //WHEN - DetailsFragment launched to display task
        val bundle = TaskDetailFragmentArgs(activeTask.id).toBundle()

        //The reason it has been given the AppTheme is because, when using this launchFragmentInContainer
        //the fragment is launched in an empty activity.Because fragments usually inherit their theme from
        //their parent activity, we want to make sure we have the correct theme here
        launchFragmentInContainer<TaskDetailFragment>(bundle, R.style.AppTheme)
        Thread.sleep(2000)
    }
}