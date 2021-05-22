
solution {
    puzzle = "P032"
    name = "OVERLAP GA"
    arm(ARM1) {
        number = 1
        position = -7 to -3
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -7 to -3
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -8 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -2
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = -7 to -2
        rotation = 6
    }
    track {
        position = -8 to -3
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
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
