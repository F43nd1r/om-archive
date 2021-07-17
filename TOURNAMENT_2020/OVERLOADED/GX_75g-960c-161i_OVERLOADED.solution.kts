
solution {
    puzzle = "w2501728107"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 3 to -3
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 2
        rotation = 14
    }
    io(INPUT) {
        index = 3
        position = -2 to 0
        rotation = 4
    }
    track {
        position = 0 to 1
        positions = listOf(0 to -1, 0 to -2, 1 to -2)
    }
    conduit {
        id = 100
        position = -5 to 1
        rotation = 0
    }
    conduit {
        id = 100
        position = -4 to -1
        rotation = 0
    }
    conduit {
        id = 101
        position = 3 to 3
        rotation = 0
    }
    conduit {
        id = 101
        position = 3 to -1
        rotation = 4
    }
    conduit {
        id = 102
        position = -9 to 3
        rotation = 0
    }
    conduit {
        id = 102
        position = -3 to 2
        rotation = -11
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
