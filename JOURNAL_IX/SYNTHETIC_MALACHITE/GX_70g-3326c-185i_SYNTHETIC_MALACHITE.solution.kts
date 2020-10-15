
solution {
    puzzle = "P109"
    name = "B GIX 1-3T"
    arm(ARM1) {
        number = 1
        position = 7 to 4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 6 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to 4
        rotation = 2
    }
    glyph(PROJECTION) {
        position = 9 to 2
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 7 to 6
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = 4 to 7
        rotation = 0
    }
    track {
        position = 6 to 5
        positions = listOf(0 to 0, 1 to -1)
    }
    conduit {
        id = 100
        position = 2 to 6
        rotation = 0
    }
    conduit {
        id = 100
        position = 4 to 6
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                pivotClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
