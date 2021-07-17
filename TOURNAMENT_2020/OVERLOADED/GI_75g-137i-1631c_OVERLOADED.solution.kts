
solution {
    puzzle = "w2501728107"
    name = "B GI 1-2T"
    arm(ARM1) {
        number = 1
        position = 0 to 0
        rotation = 3
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
        rotation = -2
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
        position = -2 to 3
        rotation = 5
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
                back()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
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
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
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
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
