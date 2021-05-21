
solution {
    puzzle = "P096"
    name = "BAD TI (Copy) (Copy)"
    arm(ARM2) {
        number = 1
        position = -7 to -2
        rotation = -1
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = -7 to -4
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -2 to -7
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = -4 to -1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 1 to -5
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 1 to -4
        rotation = -7
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -7 to -7
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -6
        rotation = 1
    }
    glyph(BONDER) {
        position = 4 to -7
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to -4
        rotation = 7
    }
    glyph(UNBONDER) {
        position = 1 to -7
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -4
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -5 to -9
        rotation = 1
    }
    io(OUTPUT) {
        index = 2
        position = -2 to -10
        rotation = -1
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -10
        rotation = -9
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(14)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
