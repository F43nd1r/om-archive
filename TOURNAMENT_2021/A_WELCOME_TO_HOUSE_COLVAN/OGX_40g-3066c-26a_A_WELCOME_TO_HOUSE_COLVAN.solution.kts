
solution {
    puzzle = "w2450560971"
    name = "B GAX"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 3
        size = 2
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
            }
        }
        )
    }
}
