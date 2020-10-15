
solution {
    puzzle = "P104"
    name = "B S 6T"
    arm(ARM1) {
        number = 1
        position = -9 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -6 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to -3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -9 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -9 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -1 to 1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -7 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -7 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -6 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -7 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = -4 to -4
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -9 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -2
        rotation = 6
    }
    track {
        position = -9 to 3
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 1)
    }
    track {
        position = -9 to -2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -6 to -4
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = -3 to -4
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -5 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -2 to 1
        positions = listOf(3 to -1, 2 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                wait(17)
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                forward()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                forward()
                reset()
                wait(4)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                forward()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(17)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateClockwise()
                forward()
                drop()
                wait(3)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                wait(5)
                forward()
                forward()
                rotateClockwise()
                drop()
                back()
                wait(6)
                grab()
                pivotClockwise()
                drop()
                back()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(11)
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                rotateClockwise()
                wait(7)
                back()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                forward()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                drop()
                forward()
                wait(1)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                repeat()
                wait(10)
                forward()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                drop()
                wait(11)
                grab()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                wait(5)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                wait(2)
                grab()
                forward()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
