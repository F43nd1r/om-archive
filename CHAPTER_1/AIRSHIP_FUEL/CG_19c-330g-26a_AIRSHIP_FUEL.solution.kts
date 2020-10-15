
solution {
    puzzle = "P008"
    name = "B CA 6T"
    arm(ARM1) {
        number = 1
        position = -2 to 0
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to 1
        rotation = -7
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = -7
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 4 to -3
        rotation = -9
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 0 to -3
        rotation = -6
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 3 to -4
        rotation = -5
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 5 to -3
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 5 to -1
        rotation = -8
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 3 to 0
        rotation = -7
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -9
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -11
    }
    glyph(BONDER) {
        position = 4 to -2
        rotation = -11
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = -11
    }
    io(INPUT) {
        index = 0
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 5 to -2
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to -1, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                extend()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                extend()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                drop()
                forward()
                forward()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                forward()
                grab()
                forward()
                forward()
                forward()
                drop()
                forward()
                grab()
                forward()
                drop()
                forward()
                forward()
                forward()
                grab()
                forward()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
