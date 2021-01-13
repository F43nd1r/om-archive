
solution {
    puzzle = "P096"
    name = "NEW G 2"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 1
        size = 3
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(DISPOSAL) {
        position = 3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -4
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -5
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = -5 to 2
        rotation = -6
    }
    io(OUTPUT) {
        index = 3
        position = -4 to -2
        rotation = -3
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
