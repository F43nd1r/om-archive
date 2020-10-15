
solution {
    puzzle = "P012"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = -2 to 1
        rotation = 5
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                reset()
                wait(2)
                grab()
                retract()
                drop()
                retract()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                reset()
            }
        }
        )
    }
}
