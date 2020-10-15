
solution {
    puzzle = "P077"
    name = "B CGX"
    arm(PISTON) {
        number = 1
        position = -3 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 6 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 8 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 7 to 2
        rotation = 4
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 8 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 10 to 0
        rotation = 0
    }
    track {
        position = -2 to 2
        positions = listOf(-1 to 0, 0 to 0, 1 to 0, 2 to 0, 3 to -1)
    }
    track {
        position = 8 to 2
        positions = listOf(-1 to -1, -2 to 0, -1 to 0, 0 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = 6 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(6)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                wait(2)
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
                wait(6)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                forward()
                pivotClockwise()
                forward()
                drop()
                wait(2)
                back()
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(21)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                back()
                grab()
                forward()
                forward()
                pivotClockwise()
                wait(1)
                forward()
                pivotClockwise()
                drop()
                back()
                wait(1)
                grab()
                forward()
                pivotCounterClockwise()
                wait(1)
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
