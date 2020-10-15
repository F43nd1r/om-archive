
solution {
    puzzle = "P079"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = 0 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 2 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 0 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 10 to 1
        rotation = -3
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 7 to 1
        rotation = 0
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 9 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 8 to -1
        rotation = -2
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 11 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 8 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                retract()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                pivotClockwise()
                extend()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
