
solution {
    puzzle = "P008"
    name = "OVERLAP GA"
    arm(ARM1) {
        number = 1
        position = 2 to -3
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = -5
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
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
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
