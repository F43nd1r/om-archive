
solution {
    puzzle = "P017"
    name = "B CAX 6T"
    arm(PISTON) {
        number = 1
        position = 0 to -4
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -4 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -3 to -2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -4 to -1
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -1 to -4
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 2 to -2
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 2 to -3
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    track {
        position = 0 to -4
        positions = listOf(-2 to 1, -1 to 0)
    }
    track {
        position = -3 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(6)
                grab()
                retract()
                retract()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                retract()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                forward()
                forward()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                pivotClockwise()
                forward()
                reset()
                wait(2)
                forward()
                wait(1)
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                forward()
                wait(2)
                forward()
                grab()
                forward()
                forward()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                pivotClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                forward()
                grab()
                forward()
                pivotClockwise()
                forward()
                pivotClockwise()
                forward()
                drop()
                forward()
                wait(2)
                grab()
                forward()
                forward()
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
                forward()
                wait(1)
                reset()
            }
        }
        )
    }
}
