
solution {
    puzzle = "P025"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to 2
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                extend()
                grab()
                pivotCounterClockwise()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
