
solution {
    puzzle = "P094"
    name = "B S"
    arm(PISTON) {
        number = 1
        position = -3 to 4
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -2 to 3
        rotation = 9
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 4 to 4
        rotation = 6
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = 4 to 5
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 8 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 6 to 4
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = -6 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 3
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 5 to 5
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -2 to 1
        rotation = 1
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
        position = -4 to 1
        rotation = 4
    }
    conduit {
        id = 100
        position = 8 to 3
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                retract()
                reset()
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(14)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                forward()
                reset()
                wait(3)
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
            sequence(4) {
                wait(13)
                grab()
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                reset()
                wait(2)
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
            sequence(6) {
                wait(18)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(11)
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
