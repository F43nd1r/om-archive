
solution {
    puzzle = "P077"
    name = "B GG"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 6 to 2
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 9 to 1
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 6 to 2
        positions = listOf(0 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = 2 to 0
        rotation = 0
    }
    conduit {
        id = 100
        position = 6 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                back()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(19)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                back()
                wait(2)
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
