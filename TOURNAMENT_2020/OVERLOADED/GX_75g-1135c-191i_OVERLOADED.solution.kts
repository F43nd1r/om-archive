
solution {
    puzzle = "w2501728107"
    name = "B GIX NOGIF"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 0 to -2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = -1 to 3
        rotation = -3
    }
    io(INPUT) {
        index = 3
        position = 2 to 0
        rotation = 1
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 0 to -1, 1 to -2)
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
        position = 1 to 2
        rotation = -3
    }
    conduit {
        id = 102
        position = -9 to 3
        rotation = 0
    }
    conduit {
        id = 102
        position = -3 to 0
        rotation = -5
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                forward()
                forward()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
