
solution {
    puzzle = "P083"
    name = "B GIX 1-2T"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 8 to -1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to 2
        rotation = 0
    }
    conduit {
        id = 100
        position = 2 to -2
        rotation = 0
    }
    conduit {
        id = 100
        position = 8 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(13)
                grab()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
