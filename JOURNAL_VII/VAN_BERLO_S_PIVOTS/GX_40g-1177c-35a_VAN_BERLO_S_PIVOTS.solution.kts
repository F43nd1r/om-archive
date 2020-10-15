
solution {
    puzzle = "P096"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 2
        size = 2
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -3
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -3
        rotation = -5
    }
    io(OUTPUT) {
        index = 2
        position = 0 to -3
        rotation = -1
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -3
        rotation = -2
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
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
