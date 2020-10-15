
solution {
    puzzle = "P025"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 0 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
