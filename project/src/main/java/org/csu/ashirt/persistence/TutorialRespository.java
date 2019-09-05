package org.csu.ashirt.persistence;

import org.csu.ashirt.domain.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// TODO
public interface TutorialRespository extends JpaRepository<Tutorial, Integer> {
    public List<Tutorial> findTutorialsByTutorialId(int tutorialId);
}
