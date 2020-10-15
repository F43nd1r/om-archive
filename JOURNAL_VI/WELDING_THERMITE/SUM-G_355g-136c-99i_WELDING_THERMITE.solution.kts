
solution {
    puzzle = "P094"
    name = "B CC"
    arm(PISTON) {
        number = 1
        position = -6 to 4
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -6 to 3
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -5 to 3
        rotation = 6
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 4 to 4
        rotation = 6
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 4 to 5
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 8 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 6 to 4
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = -4 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 4
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 5 to 5
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -5 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -5 to 5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 6 to 2
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 6 to 5
        rotation = 0
    }
    track {
        position = 4 to 5
        positions = listOf(0 to 0, 0 to -1, 0 to -2)
    }
    conduit {
        id = 100
        position = -3 to 2
        rotation = 2
    }
    conduit {
        id = 100
        position = 8 to 3
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                retract()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                retract()
                wait(3)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                forward()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                reset()
                grab()
                retract()
                retract()
                wait(1)
                extend()
                drop()
                extend()
                grab()
                pivotClockwise()
                forward()
                drop()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(16)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(9)
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
