
solution {
    puzzle = "P069"
    name = "B ACX"
    arm(PISTON) {
        number = 1
        position = 1 to -3
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 5 to -4
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 3 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -1
        rotation = -2
    }
    io(OUTPUT) {
        index = 2
        position = 4 to -2
        rotation = -1
    }
    io(OUTPUT) {
        index = 3
        position = 0 to -1
        rotation = 5
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                extend()
                grab()
                rotateCounterClockwise()
                retract()
                wait(1)
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                retract()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(4)
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                extend()
                rotateClockwise()
                extend()
                retract()
                retract()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
