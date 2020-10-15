
solution {
    puzzle = "P033"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = 0 to -3
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -3
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -1 to 1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -5 to 5
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 0 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 0 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -2 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -3 to -1
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -2
        rotation = -6
    }
    glyph(PURIFICATION) {
        position = -1 to -1
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -3 to 3
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 4
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -16 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -3
        rotation = 0
    }
    track {
        position = -5 to 4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                extend()
                pivotClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                retract()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        )
    }
}
