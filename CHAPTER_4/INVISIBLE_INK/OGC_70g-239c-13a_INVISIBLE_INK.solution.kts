
solution {
    puzzle = "P032"
    name = "OGC"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to -1
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -2
        rotation = 3
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
