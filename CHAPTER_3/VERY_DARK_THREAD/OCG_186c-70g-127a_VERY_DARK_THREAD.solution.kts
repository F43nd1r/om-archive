
solution {
    puzzle = "P029"
    name = "OGA?"
    arm(ARM1) {
        number = 1
        position = -2 to 0
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -1
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
