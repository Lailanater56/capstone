package com.lailperry.android.blackwellpttrainer;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private WorkoutsAdapter mAdapter;
    private WorkoutsList mWorkoutsList = WorkoutsList.getInstance();
    private final ArrayList<Workout> mWorkouts = mWorkoutsList.getWorkouts();

    public WorkoutsFragment() throws JSONException {
        populateData();
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_workouts, container, false);

        mRecyclerView = v.findViewById(R.id.workouts_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return v;
    }

    private void updateUI() {
        mAdapter = new WorkoutsAdapter(mWorkouts);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void populateData() throws JSONException {
        if (!mWorkoutsList.isPopulated()) {
            addMondayWorkoutWeek1();
            addTuesdayWorkoutWeek1();
            addThursdayWorkoutWeek1();
            addFridayWorkoutWeek1();

            addMondayWorkoutWeek2();
            addTuesdayWorkoutWeek2();
            addThursdayWorkoutWeek2();
            addFridayWorkoutWeek2();

            addAllWorkoutsToTheDatabase();

            mWorkoutsList.setPopulated(true);
        }
    }

    private void addAllWorkoutsToTheDatabase() throws JSONException {
        for (Workout w : mWorkouts) {
            MainActivity.mDB.insertData(w.getName(), w.getDescription(), w.getContent(), w.isComplete());
        }
    }

    private void addFridayWorkoutWeek2() {
        String name;
        String description;
        ArrayList content;
        Workout workout;
        name = "Friday Workout - Week 2";
        description = "EARN THE WEEKEND. Run recovery and bodyweight challenge\n";
        content = new ArrayList<>();
        content.add("Run 2 miles, you choose the pace but try out those new legs and put some speed on it from time to time." +
                " You’re working on running fast for a relatively short time, not slow and long, the difference is mechanics," +
                " so you need to pretend you’re sprinting conservatively this will cause you to lead with your body and propel" +
                " you forward unless you aim on leaving some teeth on the greenway.");
        workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private void addThursdayWorkoutWeek2() {
        String name;
        String description;
        ArrayList content;
        Workout workout;
        name = "Thursday Workout - Week 2";
        description = " Sprints/ Push ups\n";
        content = new ArrayList<>();
        content.add("Sprints: “Sixty One Twenty's”                                                                \n" +
                "\t6 rounds\n" +
                "\tAll out Sprint for sixty seconds walk for two minutes.\n");
        content.add("Push-ups to failure, jog 200m every time your knees touch the ground. Do this until you have completed 80 push ups\n");
        workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private void addTuesdayWorkoutWeek2() {
        String name;
        String description;
        ArrayList content;
        Workout workout;
        name = "Tuesday Workout - Week 2";
        description = "Core/ legs\n";
        content = new ArrayList<>();
        content.add("As many rounds as possible in 5 min                                                       \n" +
                "\t10 sit ups\n" +
                "\t10 frog Jumps\n" +
                "\t10 ankle touch with a twist\n" +
                "Once five minutes is up, rest 3 minutes");
        content.add("As many rounds as possible in 5 minutes\n" +
                "\t10 crunches\n" +
                "\t20m duck walks\n" +
                "\t10 Russian twists\n" +
                "Once five minutes is up, rest 3 minutes");
        content.add("-As many rounds as possible in 5 minutes \n" +
                "\t10 sit ups\n" +
                "\t10 walking lunges with a twist\n" +
                "\t10 toe touches\n" +
                "Once five minutes is up, rest 3 minute");
        content.add("-As many rounds as possible in 5 minutes\n" +
                "\t20 flutter kicks\n" +
                "\t20m bear crawl\n" +
                "\t20 leg raises\n");
        workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private void addMondayWorkoutWeek2() {
        String name;
        String description;
        ArrayList content;
        Workout workout;
        name = "Monday Workout - Week 2";
        description = "Sprints/ Push ups\n";
        content = new ArrayList<>();
        content.add("Sprints: “Thirty Sixty’s”                                                                         \n\n" +
                "\t6 rounds\n\n" +
                "\t\tSprint 30 seconds\n" +
                "\t\tWalk 60 seconds\n");
        content.add("Push-ups:  Ladder by reps \n\n" +
                "\tFor the first set do your max number of push-ups from Monday of last week, rest two minutes\n\n" +
                "\tThe second set will be 75% of this number, rest 1.5 minutes\n\n" +
                "\t50% for the 3rd set, rest 1 minute\n\n" +
                "\t25% for the 4th set , rest 30 seconds, then back up the ladder starting with the 25% set.\n\n\n" +
                "Example:  if I did 40 push-ups in two  minutes last week, then my next set will be 30, then 20, then 10 and so on.");
        workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private void addFridayWorkoutWeek1() {
        String name;
        String description;
        ArrayList content;
        Workout workout;
        name = "Friday Workout - Week 1";
        description = "EARN THE WEEKEND Sprint workout # 3/ Core/ Push-ups\n";
        content = new ArrayList<>();
        content.add("Set a 15 min running clock and sprint for 100m then walk back  to the start," +
                " immediately sprint again. Repeat this until the clock runs down.                                     " +
                " Your score is total sprints, try and beat this number next time. \n" +
                "Core and Pushups");
        content.add("As many rounds as possible in 10 minutes\n" +
                "\t10 sit ups\n" +
                "\t10 push-ups\n");
        workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private void addThursdayWorkoutWeek1() {
        String name;
        String description;
        ArrayList content;
        Workout workout;
        name = "Thursday Workout - Week 1";
        description = "Sprint workout #2 Sprint/ Jog for distance and Push-ups for reps\n";
        content = new ArrayList<>();
        content.add("Sprint 100m, Jog 100m until you complete a mile                                                 ");
        content.add("The distance increase by half a mile each week until you reach 3 miles." +
                " Keep the miles down until you can keep the Sprint’s and Jog Segments consistent.");
        workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private void addTuesdayWorkoutWeek1() {
        String name = "Tuesday Workout - Week 1";
        String description = "Core work and squats\n";
        ArrayList content = new ArrayList<>();
        content.add("5 rounds of the following, rest two minutes in between rounds.                               \n\n" +
                "\t15 squats\n" +
                "\t10 sit ups\n" +
                "\t20 crunches\n" +
                "\t20 leg lifts \n" +
                "\t20 Russian twist\n" +
                "\t30 Bicycles\n");
        Workout workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private void addMondayWorkoutWeek1() {
        String name = "Monday Workout - Week 1";
        String description = "Sprint workout # 1 Ladder and Push-ups Ladder\n";
        ArrayList<String> content = new ArrayList<>();
        content.add("Run 400m then Walk 400m");
        content.add("Run 300m then Walk 300m");
        content.add("Run 200m then Walk 200m");
        content.add("Run 100m then walk 100m  Then back up the Ladder  (I.E. 100m again then 200, 300, 400, end)     ");
        content.add("Max Push-ups for two minutes, rest two minutes");
        content.add("Max Push-ups for One minute and 30 seconds, rest 1.5 minutes");
        content.add("Max Push-ups for one minute, rest one minute");
        content.add("Max Push-ups for 30 seconds, rest 30 seconds then back up the ladder same as the run.");
        Workout workout = new Workout(name, description, content);
        mWorkouts.add(workout);
    }

    private class WorkoutsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView mWorkoutName;
        private final TextView mWorkoutDescription;
        private Workout mWorkout;

        WorkoutsHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.workouts_list, parent, false));
            itemView.setOnClickListener(this);

            mWorkoutName = itemView.findViewById(R.id.workout_name);
            mWorkoutDescription = itemView.findViewById(R.id.workout_description);
        }

        @Override
        public void onClick(View view) {

            FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, new WorkoutsDetailFragment(mWorkout))
                    .addToBackStack("WorkoutsDetailFragment")
                    .commit();
        }

        void bind(Workout workout) {
            mWorkout = workout;

            mWorkoutName.setText(mWorkout.getName());
            mWorkoutDescription.setText(mWorkout.getDescription());
        }
    }

    private class WorkoutsAdapter extends RecyclerView.Adapter<WorkoutsHolder> {

        private List<Workout> mWorkoutList;

        WorkoutsAdapter(List<Workout> workoutList) {
            mWorkoutList = workoutList;
        }

        @Override
        public WorkoutsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());

            return new WorkoutsHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(WorkoutsHolder holder, int position) {
            Workout item = mWorkoutList.get(position);
            holder.bind(item);
        }

        @Override
        public int getItemCount() {
            return mWorkoutList.size();
        }

        public void setWorkoutList(List<Workout> workoutList) {
            mWorkoutList = workoutList;
        }

    }

}
