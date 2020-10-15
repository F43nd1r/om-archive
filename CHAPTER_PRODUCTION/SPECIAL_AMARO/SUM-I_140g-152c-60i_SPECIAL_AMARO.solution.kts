
solution {
    puzzle = "P083"
    name = "B S"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 9 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 8 to -1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 10 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = -6
    }
    conduit {
        id = 100
        position = 9 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(13)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(11)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(11)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
