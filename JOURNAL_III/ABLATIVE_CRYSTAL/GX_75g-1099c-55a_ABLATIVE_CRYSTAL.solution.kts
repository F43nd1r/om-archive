
solution {
    puzzle = "P068"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 1
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                back()
                pivotClockwise()
                back()
                pivotClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                back()
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
