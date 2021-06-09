
solution {
    puzzle = "P100"
    name = "OVERLAP GA"
    arm(ARM1) {
        number = 1
        position = -1 to -3
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
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
    io(INPUT) {
        index = 0
        position = -2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
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
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
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
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
