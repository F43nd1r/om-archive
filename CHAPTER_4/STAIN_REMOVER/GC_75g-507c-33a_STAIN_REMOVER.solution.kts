
solution {
    puzzle = "P034"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 2 to 2
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 4
        rotation = 0
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        )
    }
}
