
solution {
    puzzle = "P100"
    name = "OGA"
    arm(ARM1) {
        number = 1
        position = 0 to -4
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
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
                rotateCounterClockwise()
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
