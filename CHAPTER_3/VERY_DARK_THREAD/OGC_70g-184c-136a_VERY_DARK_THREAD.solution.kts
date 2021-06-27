
solution {
    puzzle = "P029"
    name = "OVERLAP GC"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 7
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to 2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 2
        rotation = 0
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
            }
        }
        )
    }
}
