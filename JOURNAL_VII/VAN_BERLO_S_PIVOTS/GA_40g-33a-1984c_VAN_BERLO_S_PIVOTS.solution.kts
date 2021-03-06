
solution {
    puzzle = "P096"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 0
        size = 2
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -2
    }
    glyph(DISPOSAL) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = -3 to 0
        rotation = -7
    }
    io(OUTPUT) {
        index = 2
        position = -1 to 3
        rotation = -3
    }
    io(OUTPUT) {
        index = 3
        position = -1 to -1
        rotation = -4
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                reset()
                grab()
                pivotClockwise()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                reset()
                grab()
                pivotClockwise()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                reset()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
