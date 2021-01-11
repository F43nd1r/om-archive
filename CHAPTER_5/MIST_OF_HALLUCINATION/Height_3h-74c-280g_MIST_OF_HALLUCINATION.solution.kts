
solution {
    puzzle = "P038"
    name = "H3 6T"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 4 to -2
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 6 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 6 to -1
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 4 to 0
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -2 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -4 to 0
        rotation = 0
        size = 3
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 3 to -1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to -1
        rotation = 0
    }
    track {
        position = -3 to -1
        positions = listOf(-2 to 0, -1 to 0, 0 to 0, -1 to 1, 0 to 1, 1 to 1)
    }
    track {
        position = 5 to 0
        positions = listOf(-1 to 0, 0 to 0, 1 to -1, 0 to -1, 0 to -2, 1 to -2)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(5)
                grab()
                back()
                pivotClockwise()
                reset()
                wait(8)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                back()
                back()
                back()
                reset()
                wait(7)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
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
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(5)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                back()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                forward()
                grab()
                back()
                reset()
                wait(8)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
